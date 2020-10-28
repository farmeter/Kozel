import React, { Component } from 'react'
import { Link } from 'react-router-dom'
import { getGoogle } from '../../service/serviceExmaple'

class Header extends Component {

    render() {

        const result = getGoogle();
        console.log("===HELLO Header===");
        console.log(result);

        return (
            <header>
                <h1 className="title">Simple React Header</h1>
            </header>
        )
    }
}

export default Header;