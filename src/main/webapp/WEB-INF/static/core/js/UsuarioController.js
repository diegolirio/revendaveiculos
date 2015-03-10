/**
 * UsuarioController
 */
app.controller('UsuarioController', ['UsuarioService', function(UsuarioService) {
	
	var self = this;
	
	self.isLoggedIn = false; 
	
	UsuarioService.getSession().then(function(resp) {
		self.isLoggedIn = true;
		self.usuario = resp.data;
	}, function(error) {
		console.log(error.data); 
	});

}]);