import React, { Component } from 'react';
import CommonHeader from './header/CommonHeader';
import Form from '../components/Form';
import MenuItemList from './header/MenuItemList';
// import Product from './product/Product';

class App extends Component {

    // id = 3 // 이미 0,1,2 가 존재하므로 3으로 설정

    state = {
        input: '',
        todos: [
            // { id: 0, text: ' 리액트 소개', checked: false },
            // { id: 1, text: ' 리액트 소개', checked: true },
            // { id: 2, text: ' 리액트 소개', checked: false }
        ]
    }

    handleChange = (e) => {
        console.log("handleChange : " + e);
        this.setState({
            input: e.target.value // input 의 다음 바뀔 값
        });
    }

    handleCreate = () => {
        console.log("handleCreate");
        const { input, todos } = this.state;
        this.setState({
            input: '', // 인풋 비우고
            //TODO
            // concat 을 사용하여 배열에 추가
            todos: todos.concat({
                id: this.id++,
                text: input,
                checked: false
            })
        });
    }

    handleKeyPress = (e) => {
        console.log("handleKeyPress : " + e);
        if(e.key === 'Enter') {
            this.handleCreate();
        }
    }

    render() {
        const { input } = this.state;
        const {
            handleChange,
            handleCreate,
            handleKeyPress,
        } = this;

        return (
            <>
                <CommonHeader form={(
                    <Form
                        value={input}
                        onKeyPress={handleKeyPress}
                        onChange={handleChange}
                        onCreate={handleCreate}
                    />
                )}>
                    <MenuItemList/>
                </CommonHeader>
                {/*<Product />*/}
            </>
        );
    }
}

export default App;