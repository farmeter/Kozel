import React, { Component } from 'react';
import MenuItem from './MenuItem';

class MenuItemList extends Component {
    render() {
        const { todos, onToggle, onRemove } = this.props;

        return (
            <div>
                <MenuItem text="Home"/>
                <MenuItem text="List"/>
                <MenuItem text="My"/>
            </div>
        );
    }
}

export default MenuItemList;