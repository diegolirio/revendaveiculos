/**
 * MarcaService 
 */
app.factory('MarcaService', ['$http', function($http) {
	
	var _getAllList = function() {
		return $http.get('/revendaveiculos/marca/get/list/json'); 
	};
	
	var _get = function(id) {
		return $http.get('/revendaveiculos/marca/'+id+'/json');
	};
	
	return {
		
		getAllList : _getAllList,
		
		get : _get
		
	};
	
}]);