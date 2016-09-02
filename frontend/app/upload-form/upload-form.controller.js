/**
 * Created by rohithvajhala on 01-09-2016.
 */
function NoteFormController(uploadservice) {
    var vm = this;

    vm.$onInit = $onInit;

    /**
     * If a parent controller has provided a on-submit attribute, then we use it. Otherwise, use defaultSubmitForm
     * @example <note-form on-submit="doSomething()"></note-form>
     * @type {Function}
     */
    vm.onSubmit = vm.onSubmit || defaultSubmitForm;

    function $onInit() {
        var parentControllerHasSetData = angular.isDefined(vm.data);
        vm.title = parentControllerHasSetData ? vm.data.title : '';
        vm.text = parentControllerHasSetData ? vm.data.text : '';
    }


    /**
     * The default function for when the user presses 'Submit'. The default behaviour
     * for a form is to create a new note using the API.
     * @param {String} title
     * @param {String} text
     */
    function defaultSubmitForm(text) {
        uploadService.upload(text)
            /*.then(vm.uploadController.refreshNotes)
            .then(defaultResetForm);*/
    }
}