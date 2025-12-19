import {useState} from "react";

//custom훅 - 훅은 관례적으로 소문자 use로 시작
function useCounter(initialValue : number){
    const [count, setCount] = useState(initialValue);

    const upCount = () => setCount((count) => count +1);
    const downCount = () => setCount((count) => Math.max(count -1, 0));

    return [count, upCount, downCount ]
}

export default useCounter;