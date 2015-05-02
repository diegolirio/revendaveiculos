/**
 * UsuarioService, camada que acessa o back-end
 */
app.factory('UsuarioService', ['$http', function($http) {
	
	var _getSession = function() {
		return $http.get('/revendaveiculos/usuario/session');
	};
	
	var _login = function(usuario) {
		return $http.post('/revendaveiculos/usuario/login', usuario);
	};
	
	/*
	 * Invalida session no back-end
	 */
	var _logout = function() {
		return $http.get('/revendaveiculos/usuario/logout');
	};
	
	/*
	 * Acesso publico
	 */
	return {
		
		getSession : _getSession,
		
		login : _login,
		
		logout : _logout
		
	};
	
}]);