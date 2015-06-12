/**
 * 
 */
app.controller('MarcaFormController', ['MarcaService', '$routeParams', function(MarcaService, $routeParams) {
	
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
	
		
}]);