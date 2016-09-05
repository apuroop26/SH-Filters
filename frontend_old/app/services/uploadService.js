/**
 * Created by rohithvajhala on 01-09-2016.
 */
/**
 * Created by rohithvajhala on 01-09-2016.
 */
/**
 * The noteService factory has the sole responsibility to communicate between the frontend_old application
 * and the backend application. You can think of it as a 'internal API' for our frontend_old application.
 *
 * @param $http the injected http service
 * @param $interpolate the injected interpolate service
 * @returns {Object}
 */
function uploadservice($http, $interpolate) {
    /**
     * This is the base URL to our API in the backend.
     * @type {String}
     */
    var toListURL   = '/api/upload/';

    /**
     * This is the detail URL to our API in the backend. It handles requests with path parameters.
     * E.g. /api/note/5/
     * @type {Function}
     */
    var toDetailURL = $interpolate('/api/upload/{{id}}/');


    return {
        list: list,
        upload: upload,
       /* destroy: destroy,
        update: update*/
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
    function upload(text) {
        return $http.post(toListURL, {text: text });
    }

    /*function create(title) {
        return $http.post(toListURL, { text: title });
    }*/


    /**
     * Sends a DELETE request to the API
     * @param {Number} id the id number of the note to delete
     * @returns {Object}
     */
    /*function destroy(id) {
     return $http.delete(toDetailURL({ id: id }));
     }*/


    /**
     * Sends a PUT request to the API
     * @param {Number} id the id number of the note to update
     * @param {String} title the title of the note to update
     * @param {String} text the text of the note to update
     * @returns {Object}
     */
    /* function update(id, title, text) {
     return $http.put(toDetailURL({ id: id }), { id: id, title: title, text: text });
     }*/
}
