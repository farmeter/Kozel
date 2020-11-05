const request = require('request');

const getGoogle = () => {
    request('http://www.google.com', function (error, response, body) {
        return response;
    });
}

const getSampleEmployees = (categoryNo) => {
    //TODO cateogryNo

    request('http://dummy.restapiexample.com/api/v1/employees', function (error, response, body) {
        return response;
    });
}


// request.get({uri:"http://www.google.com"}, function (error, response, body) {
//     //callback
// });

export { getGoogle, getSampleEmployees };