import React, { useCallback, useMemo, useRef, useState } from "react";

const getAverage =( numbers : number[] )=> {
  console.log('평균값 계산중..');
  if (numbers.length === 0) return 0;
  const sum = numbers.reduce((a, b) => a + b);
  return sum / numbers.length;
};

const CallbackAvgApp = () =>{
    const [list, setList] = useState<number[]>([]);
    const [number, setNumber] = useState('');
    const inputEl = useRef<HTMLInputElement>(null);
    
    const inputOnChange = useCallback((event : React.ChangeEvent<HTMLInputElement>) => {
         setNumber(event.target.value);
    }, []); // 컴포넌트가 처음 렌더링 될 때만 함수 생성

    const onAddScore = useCallback(() => {      
        console.log(number);
        const nextList = list.concat(parseInt(number));
        console.log(nextList);
        setList(nextList);
        setNumber('');
        if (inputEl.current)
            inputEl.current.focus();
    }, [number, list]);  // number 혹은 list 가 바뀌었을 때만 함수 생성
    // }, []);
     const avg = useMemo(() => getAverage(list), [list]);

    return (
        <>
            <input  value={number} onChange={inputOnChange} ref={inputEl} />
            <button onClick={onAddScore}>점수 추가 추가</button>
            <ul>
                
                {list.map((value, index) => (
                    <li key={index}>{value}</li>
                ))}
            </ul>
            <div> 평균 : {avg}</div>
        </>
    );
}

export default CallbackAvgApp;