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
	
	var _getList = function() {
		return $http.get('/revendaveiculos/veiculo/get/list');
	};
	
	return {
		
		getVeiculosHome : _getVeiculosHome,
		
		getPorId : _getPorId,
		
		getList : _getList
		
	};
	
}]);