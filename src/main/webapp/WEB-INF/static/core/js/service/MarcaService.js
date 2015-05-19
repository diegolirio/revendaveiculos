/**
 * MarcaService 
 */
app.factory('MarcaService', ['$http', function($http) {
	
	var _getAllList = function() {
		return $http.get('/revendaveiculos/marca/get/list/json'); 
	};
	
	return {
		
		getAllList : _getAllList
		
	};
	
}]);