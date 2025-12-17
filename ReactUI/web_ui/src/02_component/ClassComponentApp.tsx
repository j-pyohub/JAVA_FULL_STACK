import { Component, type ReactNode } from "react";

class ClassComponentApp extends Component{
    //랜더링 함수 재정의
    render(): ReactNode { //재정의할 때, return 타입 있으면 그걸로.. node는 element의
        return <h1>ClassComponent Data</h1>
    }
}
export default ClassComponentApp;