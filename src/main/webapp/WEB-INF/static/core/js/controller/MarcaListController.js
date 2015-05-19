/**
 * MarcaListController
 */
app.controller('MarcaListController', ['MarcaService', function(MarcaService) {
	
	var self = this;
	
	MarcaService.getAllList().then(function(resp) {
		self.marcas = resp.data;
	}, function(error) {
		alert(error.data);
	});
	
}]);