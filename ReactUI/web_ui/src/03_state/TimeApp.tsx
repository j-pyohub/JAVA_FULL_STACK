
export default function TimeApp() {
    return (
        <>
            <h1>현재 시간</h1>
            <h2>{new Date().toLocaleTimeString()}</h2>
        </>
    )
}