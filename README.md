오늘은 액티비티에 대해서 배웠는데 액티비티를 한군데가아니라 여러군대로 옮길수있게 왔다갓다하면서 데이터도 서로 전달하는 식을 배웠다.
Back키를 따로 만들어야하는줄알았는데 굳이 그럴필요가없고 만약에 버튼으로 메인으로 돌아가야하면 Intent 를 써서 만들면 돌아갈수있다.
Intent는 굳이 화면 뿐만아니라 데이터를 전달 할수도있으며 intent.putExtra로 키값을 주고 intent.getStringExtra를 하면 키값을적고 데이터를
받아올수가있다.
그리고 임시적 인텐트로를 쓸대 주의점은 권한을 Mnifest에다가 무조건 요청을 해줘야한다.
