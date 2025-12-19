
function Toolbar(props : {isLoggedIn : boolean, 
          onClickLogin : () => void, 
          onClickLogout : () => void}){
    const {isLoggedIn, onClickLogin, onClickLogout} = props;

    return (
        <div >
            <span>{isLoggedIn ? '환영합니다' : '회원 전용' } </span>

            {isLoggedIn ? 
                (<button onClick={onClickLogout}>로그아웃</button>) 
                :
                (<button onClick={onClickLogin}>로그인</button>)
            }
        </div>
    );
}

export default Toolbar;