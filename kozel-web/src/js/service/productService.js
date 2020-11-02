const request = require('request');

const getCategory = (categoryNo) => {
    //TODO cateogryNo

    request('/api/categories', function (error, response, body) {
        return response;
    });
}

export { getGoogle, getCategory };