import React, { Component } from 'react';
import MenuItem from './SearchItem';

class SearchItemList extends Component {
    render() {
        const { todos, onToggle, onRemove } = this.props;

        const menus = ['Home', 'List', 'My' ,'Qna'];

        return (
            <div>
                {menus.map((value, index) => {
                    return <MenuItem key={index} text={value}/>
                })}
            </div>
        );
    }
}

export default SearchItemList;