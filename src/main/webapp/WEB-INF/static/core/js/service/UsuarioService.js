/**
 * UsuarioService
 */
app.factory('UsuarioService', ['$http', function($http) {
	
	var _getSession = function() {
		return $http.get('/revendaveiculos/usuario/session');
	};
	
	return {
		
		getSession : _getSession
		
	};
	
}]);