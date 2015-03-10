/**
 * UsuarioLoginController
 */
app.controller('UsuarioLoginController', ['$scope', 'UsuarioService', function($scope, UsuarioService) {
	
	var self = this;
	/*
	 * Esconde Menu
	 */
	$scope.hideMenu = true; 
	
	/*
	 * Mensagem de login errado
	 */
	self.mensagemLogin = null;
	
	/*
	 * Efetua o Login
	 */
	self.login = function(usuario) {
		alert(JSON.stringify(usuario));
	};
	
	
}]);