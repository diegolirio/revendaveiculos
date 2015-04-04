/**
 * OpcionalService
 */
app.factory('OpcionalService', ['$http', function($http) {
	
	var _getListaPorVeiculo = function(veiculo) {
		return $http.get('/revendaveiculos/opcional/get/lista/por/veiculo/'+veiculo.id);
	};
	
	return {
		
		getListaPorVeiculo : _getListaPorVeiculo
		
	};
	
}]);