const request = require('request');

request('http://www.google.com', function (error, response, body) {
    //callback
});

request.get({uri:"http://www.google.com"}, function (error, response, body) {
    //callback
});