import  {useEffect, useState} from "react";
import useCounter from "./6_useCounter";
// //useEffect = 렌더링 될때마다 특정 작업 수행
const MAX_COUNT = 10;
function UseCountApp(){
    const [isFull, setIsFull] = useState(false);
    const [count, upCount, downCount] = useCounter(1); //userCounter.tsx
    // //처음 로딩될때 두번 실행 - 컴포넌트가 문제 없는지 확인하는 과정
    // //[]이 없음으로 mount 직후 호출 compoment가 변경되면 호출
    useEffect(() =>{
        console.log("=====");
        console.log("useEffect() call - compoment가 변경되면 호출된다 ");
        console.log(`isFull:${isFull}`);
    });
    // //랜더링 될때마다 작업 수행 = mount 직후 호출 [count]가 바뀔때 마다 호출
    useEffect(() =>{
        setIsFull(count >= MAX_COUNT); //false->true
        console.log(`Currend Count : ${count}`);
    }, [count]);
    return(
        <div>
            <p>{`${count}명 수용`}</p>
            <button onClick={upCount} disabled={isFull}>입장</button>
            <button onClick={downCount} >퇴장</button>
            {isFull && <p>가득</p>}
        </div>
    );
}
export default UseCountApp;