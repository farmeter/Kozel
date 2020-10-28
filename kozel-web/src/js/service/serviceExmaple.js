const request = require('request');

const getGoogle = () => {
    request('http://www.google.com', function (error, response, body) {
        return response;
    });
}


request.get({uri:"http://www.google.com"}, function (error, response, body) {
    //callback
});

export { getGoogle };