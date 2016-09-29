/**
 * The noteService factory has the sole responsibility to communicate between the frontend application
 * and the backend application. You can think of it as a 'internal API' for our frontend application.
 *
 * @param $http the injected http service
 * @param $interpolate the injected interpolate service
 * @returns {Object}
 */
function noteService($http, $interpolate) {
    /**
     * This is the base URL to our API in the backend.
     * @type {String}
     */
    var toListURL   = '/api/fileUpload/';

    /**
     * This is the detail URL to our API in the backend. It handles requests with path parameters.
     * E.g. /api/note/5/
     * @type {Function}
     */
    var toDetailURL = $interpolate('/api/fileUpload/{{id}}/');


    return {
        list: list,
        create: create,
        destroy: destroy,
        update: update
    };


    /**
     * Sends a GET request to the API.
     * @returns {Object}
     */
    function list() {
        return $http.get(toListURL);
    }


    /**
     * Sends a POST request to the API
     * @param {String} title the title of the note to create
     * @param {String} text the text of the note to create
     * @returns {Object}
     */
    function create(title, text) {
        return $http.post(toListURL, { title: title, text: text });
    }


    /**
     * Sends a DELETE request to the API
     * @param {Number} id the id number of the note to delete
     * @returns {Object}
     */
    function destroy(id) {
        return $http.delete(toDetailURL({ id: id }));
    }


    /**
     * Sends a PUT request to the API
     * @param {Number} id the id number of the note to update
     * @param {String} title the title of the note to update
     * @param {String} text the text of the note to update
     * @returns {Object}
     */
    function update(id, title, text) {
        return $http.put(toDetailURL({ id: id }), { id: id, title: title, text: text });
    }
}