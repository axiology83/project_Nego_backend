# 여긴 어디죠?
<br>

제가 6개월의 국비 지원 웹 개발자 과정을 수강하면서 진행한 프로젝트를 올려둔

Github 레파지토리 입니다. Nego Project 라고 이름을 붙여 보았죠.

프로젝트라고 했지만, 거창하게 완결된 서비스를 혼자 다 만들어보려고 하지는 않았고

자신과 상대방의 위치에 근거해서 중고거래를 한다면 꼭 필요한 기능들을 구현해보려고 하였습니다.
<br><br>

# 그래서 어떤 기능을 구현해 보았나요? 
<br>
국비 지원 과정에서는 기본적인 CRUD(Create-Read-Update-Delete) 작동 위주로 배웠습니다만,
이것만으로는 위치 기반 중고 거래 서비스가 만들어질 수 없다고 판단하였습니다.
<br><br>
제가 진행한 프로젝트에서는
<br><br>

1. 위치를 기반으로 거리를 측정해 일정 거리 내에 있는 판매건들을 지도 위에 표시하고 목록을 출력하도록 하는 기능
2. 판매자와 구매자의 1:1 채팅
3. 게시판과 채팅에서 자유롭게 원하는 곳에 이미지 파일을 삽입할 수 있는 기능
<br><br>

위 세 가지 기능을 제대로 구현해보려고 했습니다.
간단히 Flutter Application으로 구현된 부분을 보여드리겠습니다.
<br><br>
![find_by_range](https://github.com/axiology83/project_Nego_backend/assets/132986829/876f33a3-ffef-4641-bbaf-8b530039e158)
![Chat_with_img](https://github.com/axiology83/project_Nego_backend/assets/132986829/404f74ee-c270-418c-b94f-79b82b7198c7)

<br><br>

# 프로젝트는 무엇으로, 어떻게 구성되어 있습니까?
<br>
프로젝트는 교육과정에 맞게 크게 4 부분으로 구성하였습니다.<br><br>

- Spring Cloud 기반의 MSA로 개발된 BackEnd Web Server - [https://github.com/axiology83/project_Nego_backend]

- React로 개발된 FrontEnd Web Server - [https://github.com/axiology83/project_Nego_frontend]

- Flutter로 개발된 Mobile App - [https://github.com/axiology83/project_Nego_mobileapp]
<br><br>

- kubernetes 기반으로 구성된 소규모 On-Premise Server

지금 보고 계시는 페이지는 BackEnd Server 페이지 입니다.
<br><br>

# 실제로 사용해볼 수 있나요?
<br>
Spring BackEnd와 React FrontEnd를 제 방에 있는 서버에 실제로 구동해둔 주소는 아래와 같습니다.

[http://axiology.iptime.org:3000](http://axiology.iptime.org:3000)

메인 페이지 가운데 적혀 있는 테스트용 ID(jwy@0)와 비밀번호(1)로 로그인 하시면 구현된 기능들을 살펴보실 수 있습니다. <br>
메인 페이지에 프로젝트 소개 슬라이드쇼를 준비해 두었습니다.<br> 
슬라이드 쇼에는 Flutter Application이 구동되는 모습이 담긴 Gif파일도 있습니다.



