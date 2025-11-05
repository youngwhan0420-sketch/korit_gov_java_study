//싱글톤으로 만들것
//signin
//로그인을 시도한 사용자 이름 확인 userRepository에서
//해당 사용자 이름을 가진 User객체가 있는지 확인
//객체가 null이면 함수 탈출(사용자 정보를 다시 확인하세요.)

//비밀번호 일치 확인
//비밀번호가 일치하지 않으면 함수 탈출(사용자 정보를 다시 확인하세요.)

//로그인 성공 -> 로그인 성공한 User객체 toString으로 출력
//isEmpty boolean
//username, password 각각 null이거나 공백이 아닌지 확인 용도

//SigninReqDto객체 생성 후 로그인 정보 각각 입력받음 (단 isEmpty로 확인)
//유효성 검사 완료 후 signin()호출