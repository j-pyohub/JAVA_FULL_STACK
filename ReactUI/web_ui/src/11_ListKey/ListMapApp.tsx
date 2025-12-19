const student = [
    {   stuNum:1,
        name:"Jeon",
    },
    {   stuNum:2,
        name:"Lee",
    },
    {   stuNum:3,
        name:"Kim",
    },
];

function ListMapApp(){
    return (
        <ul>
            {student.map((student) =>{
                //map에는 key 속성 필수. 보통 태그 안에 숨겨둠. 유일 데이터(주로 id) 사용
                return <li key={student.stuNum}>{student.name}</li>
            })}
        </ul>
    );
}
export default ListMapApp;
