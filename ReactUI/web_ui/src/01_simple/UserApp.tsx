import UserMessage from './UserMessage';
import './userStyle.css';
const reactName = 'react2'; //서버에서 받아온 데이터라고 가정
const user = undefined;
//확장은 여기서. 메인은 건들지X
function UserApp() {
    //범용 스타일은 css로 작성, 개별 스타일은 객체로 작성
    const userStyle = {
        backgroundColor: 'lightgray'
    };
    return(
        <div>
            {reactName === 'react' ? (<h1>yes</h1>) : (<h3>no</h3>)} {/*if 없이, 조건 체크*/}
            <br />
            {reactName == 'react2' && <h1> &&조건이 참일 때만은 연산자 활용</h1>}
            <br />
            {user || 'user 없음'} {/*정의 자체가 안 된 것은 실행X 초기값을 넣었을 때 사용.*/}
            <br />
            <div style={userStyle}>
                글상자
            </div>
            <div className="reactStyle">
                글상자
            </div>
            <UserMessage />
            <UserMessage />
            <UserMessage />
        </div>

    );
}

export default UserApp;