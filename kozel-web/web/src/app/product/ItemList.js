import React, { Component } from 'react';
import '../header/style/MenuItem.css';

class MenuItem extends Component {
    render() {
        const { text, checked, id, onRemove } = this.props;

        const onToggle = (e) => {
            console.log("MenuItem onToggle");
            console.log(e);
        }

        return (
            <div className="menu-item" onClick={() => onToggle(id)}>
                <div className={`menu-text ${checked && 'checked'}`}>
                    <div>{text}</div>
                </div>
            </div>
        );
    }
}

export default ItemList;