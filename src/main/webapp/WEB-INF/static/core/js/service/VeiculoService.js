/**
 * VeiculoService
 */
app.factory('VeiculoService', ['$http', function($http) {
	
	var _getVeiculosHome = function() {
		return $http.get('/revendaveiculos/veiculo/get/list/home');
	};
	
	return {
		
		getVeiculosHome : _getVeiculosHome
		
	};
	
}]);