/**
 * ModeloListController responsavel por manipular a pagina modelo/list.jsp 
 */
app.controller('ModeloListController', ['ModeloService', function(ModeloService) {
	
	var self = this;
	
	ModeloService.getAllList().then(function(resp) {
		self.modelos = resp.data;
	}, function(error) {
		alert(error.data);
	});
	
}]);