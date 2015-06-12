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
	
	var _save = function(marca) {
		return $http.post('/revendaveiculos/marca/save/json', marca);
	};
	
	var _delete_ = function(id) {
		return $http.post('/revendaveiculos/marca/delete/'+id+'/json');
	};
	
	return {
		
		getAllList : _getAllList,
		
		get : _get,
		
		save : _save,
		
		delete_ : _delete_
		
	};
	
}]);