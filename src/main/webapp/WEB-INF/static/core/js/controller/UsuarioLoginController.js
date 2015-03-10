/**
 * UsuarioLoginController
 */
app.controller('UsuarioLoginController', ['$scope', '$window', 'UsuarioService', function($scope, $window, UsuarioService) {
	
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
		UsuarioService.login(usuario).then(function(resp) {
			$window.location.href = '/revendaveiculos';
		}, function(error) {
			alert(error.data);
		});
	};
	
	
}]);