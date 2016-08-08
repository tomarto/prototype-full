//= wrapped

angular
    .module('prototype.comprobantes')
    .controller('GuardarComprobantesCtrl', GuardarComprobantesCtrl);

function GuardarComprobantesCtrl($state, comprobantesService, toasterService) {
    var vm = this;

    vm.subirXML = subirXML;

    function subirXML(archivos, archivosInvalidos, type) {
        vm.archivos = archivos;
        vm.archivosInvalidos = archivosInvalidos;

        if(archivos.length) {
            comprobantesService.save(vm.archivos, type)
                .then(function(response) {
                    toasterService.success('Carga completa');
                    $state.go('comprobantes');
                })
                .catch(function(response) {
                    toasterService.error(response + ' archivos fallaron');
                });
        }
    }
}