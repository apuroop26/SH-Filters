/**
 * Created by Suveen on 20/09/16.
 */
function filterControl(fileService) {
    var vm = this;
    vm.$onInit = $onInit;
    vm.refreshNotes = refreshNotes;
    vm.hasNotes = hasNotes;

    function $onInit() {
        vm.notes = [];
        vm.refreshNotes();
    }

    function refreshNotes() {
        return fileService.list().then(function refreshNotes(response){
            vm.notes = response.data;
        });
    }

    function hasNotes(){
        return vm.notes.length > 0;
    }

}