import { Component, type ReactNode } from "react";

//class형 compontent에서 state 사용하기
class ClassCounter extends Component{ 
    state = {num1:0, num2:100}; //component 상속 받으면 state라는 데이터 공간 저장되어 있어서, 바로 사용 가능 -> 바뀌는 데이터만 상태관리 가능
    render() : ReactNode {
        const {num1, num2} = this.state;
        return(
            <>
                <h1>Class state - {this.state.num2} or {num2}</h1>
                <button onClick={() =>{
                    this.setState({
                        num2:num2-1, //지역변수를 바꾸면 setState를 통해서 member도 바뀜 -> 서로 참조하고 있음
                    })
                }}>down</button>
            </>
        )
}
}
export default ClassCounter;