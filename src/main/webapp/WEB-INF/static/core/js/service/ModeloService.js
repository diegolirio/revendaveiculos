/**
 * 
 */
app.factory('ModeloService', ['$http', function($http) {
	
	var _getAllList = function() {
		return $http.get('/revendaveiculos/modelo/get/list/all');
	};
	
	return {
		
		getAllList : _getAllList
		
	};
	
}]);