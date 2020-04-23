import React, { Component } from 'react';
import MenuItem from './MenuItem';

class MenuItemList extends Component {
    render() {
        const { todos, onToggle, onRemove } = this.props;

        return (
            <div>
                <MenuItem text="hello"/>
                <MenuItem text="2"/>
                <MenuItem text="3"/>
            </div>
        );
    }
}

export default MenuItemList;