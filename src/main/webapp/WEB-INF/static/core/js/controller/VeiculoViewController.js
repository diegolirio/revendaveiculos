/**
 * VeiculoViewController
 */
app.controller('VeiculoViewController', ['$routeParams', 'VeiculoService', 'FotoService', 'OpcionalService', 
                                         function($routeParams, VeiculoService, FotoService, OpcionalService) {
	
	var self = this;
	
	VeiculoService.getPorId($routeParams.id).then(function(resp) {
		self.veiculo = resp.data;
		FotoService.getListaPorVeiculo(self.veiculo).then(function(resp) {
			self.fotos = resp.data;
		}, function(error) {
			alert(error.data);
		});
		
		OpcionalService.getListaPorVeiculo(self.veiculo).then(function(resp) {
			self.opcionais = resp.data;
//			alert(JSON.stringify(self.opcionais));
		}, function(error) {
			alert(error.data);
		});
		
	}, function(error) {
		alert(error.data);
	});
	
}]);