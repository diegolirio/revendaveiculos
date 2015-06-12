/**
 * MarcaFormController responsavel por manipular o marca/form.jsp
 */
app.controller('MarcaFormController', ['MarcaService', '$routeParams', '$window', function(MarcaService, $routeParams, $window) {
	
	var self = this;
	
	if($routeParams.id > 0) {
		MarcaService.get($routeParams.id).then(function(resp) {
			//alert(JSON.stringify(resp));
			self.marca = resp.data;
			self.isUpdate = true; 
		}, function(error) {
			alert(error);
		});
	} 
	
	self.save = function(marca) {
		
		if(marca.id <= 0 || marca.id == undefined) { 
			marca.urlImage = '/revendaveiculos/static/images/marcas/sem_imagem.png';
		} 
		
		MarcaService.save(marca).then(function(resp) {
			$window.location.href = "/revendaveiculos/#/marca/edit/"+resp.data.id;
		}, function(error) {
			alert(JSON.stringify(error));
		});
		
	};
	
	
	self.del = function() {
		MarcaService.delete_(self.marca.id).then(function(resp) {
			alert('Marca Excluida com sucesso');
			$window.location.href = "/revendaveiculos/#/marca/edit/0"; 
		}, function(error) {
			alert(JSON.stringify(error));
		});
	};
	
		
}]);