import React, { Component } from 'react';
import MenuItem from './SearchItem';

class SearchItemList extends Component {
    render() {
        const { todos, onToggle, onRemove } = this.props;

        const sampleElements = ['Home', 'List', 'My'];

        return (
            <div>
                <MenuItem text="Home"/>
                <MenuItem text="List"/>
                <MenuItem text="My"/>
            </div>
        );
    }
}

export default SearchItemList;