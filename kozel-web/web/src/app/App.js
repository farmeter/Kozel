import React, { Component } from 'react';
import Header from './header/Header';
import Product from "./product/Product";

class App extends Component {
    render() {
        return (
            <>
                <Header/>
                <Product/>
            </>
        );
    }
}

export default App;