import React, { Component } from 'react';

class Menu extends Component {
    render() {

        const sampleElements = ['Home', 'List', 'My'];

        return (
            <div>
                {sampleElements.map((value, index) => {
                        return <div key={index}>{value}</div>
                })}
            </div>
        );
    }
}

export default Menu;