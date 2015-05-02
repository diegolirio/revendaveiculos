/**
 * Controller da pagina home
 */	
app.controller('HomeController', ['$scope', 'VeiculoService', function($scope, VeiculoService) {

	var self = this;
	
//	VeiculoService.getVeiculosHome().then(function(resp) {
	VeiculoService.getList().then(function(resp) {
		self.veiculos = resp.data;
	}, function(error) {
		alert('Erro ao buscar veiculos: ' + error.data);
	});
	
	
}]);