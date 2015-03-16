/**
 * VeiculoService
 */
app.factory('VeiculoService', ['$http', function($http) {
	
	var _getVeiculosHome = function() {
		return $http.get('/revendaveiculos/veiculo/get/list/home');
	};
	
	var _getPorId = function(id) {
		return $http.get('/revendaveiculos/veiculo/get/'+id);
	};
	
	return {
		
		getVeiculosHome : _getVeiculosHome,
		
		getPorId : _getPorId
		
	};
	
}]);