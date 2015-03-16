/**
 * VeiculoViewController
 */
app.controller('VeiculoViewController', ['$routeParams', 'VeiculoService', function($routeParams, VeiculoService) {
	
	var self = this;
	
	VeiculoService.getPorId($routeParams.id).then(function(resp) {
		self.veiculo = resp.data;
	}, function(error) {
		alert(error.data);
	});
	
}]);