/**
 * FotoService
 */
app.factory('FotoService', ['$http', function($http) {
	
	var _getListaPorVeiculo = function(veiculo) {
		return $http.get('/revendaveiculos/foto/get/lista/por/veiculo/'+veiculo.id);
	};
	
	return {
		
		getListaPorVeiculo : _getListaPorVeiculo
		
	};
	
}]);