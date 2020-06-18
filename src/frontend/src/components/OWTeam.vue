<template>
    <div>
        <div class="top">
            <img class="google" src="https://www.google.co.kr/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png" title="Google">
            <input class="search" v-model="searchWord" type="text" style=" background-repeat: no-repeat; background-position: 88% 50%, 98% 50%;" title="검색">
        </div>
        <v-simple-table>
            <template v-slot:default>
<!--                <thead>-->
<!--                <tr>-->
<!--                    <th class="text-left">TeamImg</th>-->
<!--                    <th class="text-left">Team</th>-->
<!--                </tr>-->
<!--                </thead>-->
<!--                <tbody>-->
<!--                <tr v-for="item of owteams" :key="item.image">-->
<!--                    <td><img class="image" :src="item.teamimg"></td>-->
<!--                    <td>{{ item.team }}</td>-->
<!--                </tr>-->
<!--                </tbody>-->
                <tbody>
                    <tr>
                        <td style="text-align:center;">
                            <div class="wiki-paragraph">
                                <div style="margin:0 -10px">
                                    <span class="wiki-color" style="color:#ffffff">
                                        <dl class="wiki-folding">
                                            <dd class="start show finished" style="">
                                                <div style="margin-bottom:-15px">
                                                    <span class="wiki-color" style="color:#1d1d1d">
                                                        <div class="wiki-table-wrap" style="width:100%">
                                                            <table class="wiki-table wiki-dynamic-e2ddb11c6550cc5785c816ba8f8df439" style="background-color:#fff; width:100%;" data-dark-style="background-color:gray;">
                                                                <tbody>
                                                                    <tr>
                                                                        <td colspan="2" style="background-color:#2a8c97; width:50%; text-align:center;">
                                                                            <div class="paragraph">
                                                                                <a class="wiki-link-internal" href="https://ww.namu.la/s/3ae137776cc1f4c1236669383d3f25e9fd37f21759311b614bcbb0e54239fb563c6ebf7581a582be3eea8d68f85d70ce9310f52de747636c4805693481b672c2d33acca02015fb0ba55136644134543bcc6a54a542d6d590fa936caa1e546334" title="파일:대서양 디비전 로고.png" rel="nofollow">
                                                                                    <span class="wiki-image-align-normal" style="width:25px;">
                                                                                        <span class="wiki-image-wrapper" style="width: 100%;">
                                                                                            <img class="divition_logo" width="100%" src="data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iNDQ2IiBoZWlnaHQ9IjQzMiIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj48L3N2Zz4=">
                                                                                            <img class="divition_logo" width="100%" src="//ww.namu.la/s/3ae137776cc1f4c1236669383d3f25e9fd37f21759311b614bcbb0e54239fb563c6ebf7581a582be3eea8d68f85d70ce9310f52de747636c4805693481b672c2d33acca02015fb0ba55136644134543bcc6a54a542d6d590fa936caa1e546334" data-filesize="14227" data-src="//ww.namu.la/s/3ae137776cc1f4c1236669383d3f25e9fd37f21759311b614bcbb0e54239fb563c6ebf7581a582be3eea8d68f85d70ce9310f52de747636c4805693481b672c2d33acca02015fb0ba55136644134543bcc6a54a542d6d590fa936caa1e546334" alt="파일:대서양 디비전 로고.png">
                                                                                        </span>
                                                                                    </span>
                                                                                </a>
                                                                                <span class="wiki-color" style="color:#fff">
                                                                                    <strong>대서양 컨퍼런스</strong>
                                                                                </span>
                                                                            </div>
                                                                        </td>
                                                                        <td colspan="2" style="background-color:#9c3628; width:50%; text-align:center;">
                                                                            <div class="paragraph">
                                                                                <a class="wiki-link-internal" href="/w/%ED%8C%8C%EC%9D%BC:%ED%83%9C%ED%8F%89%EC%96%91%20%EB%94%94%EB%B9%84%EC%A0%84%20%EB%A1%9C%EA%B3%A0.png" title="파일:태평양 디비전 로고.png" rel="nofollow">
                                                                                    <span class="wiki-image-align-normal" style="width:25px;">
                                                                                        <span class="wiki-image-wrapper" style="width: 100%;">
                                                                                            <img class="divition_logo" width="100%" src="data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iNDQ2IiBoZWlnaHQ9IjQzMiIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj48L3N2Zz4=">
                                                                                            <img class="divition_logo" width="100%" src="//w.namu.la/s/b8cefae98691db2db12ed0826de92ed3f7764e6aae44e1a8ed2b3895e2c55179773da19bb0d18b91a90c2655207f73098d60b7d143f146db2b9fcb5f352a34e728a01e445c30fa67ea140b8aa3e97726f22172df578958c17fcc74680a4a3bed" data-filesize="9063" data-src="//w.namu.la/s/b8cefae98691db2db12ed0826de92ed3f7764e6aae44e1a8ed2b3895e2c55179773da19bb0d18b91a90c2655207f73098d60b7d143f146db2b9fcb5f352a34e728a01e445c30fa67ea140b8aa3e97726f22172df578958c17fcc74680a4a3bed" alt="파일:태평양 디비전 로고.png" loading="lazy">
                                                                                        </span>
                                                                                    </span>
                                                                                </a>
                                                                                <span class="wiki-color" style="color:#fff">
                                                                                    <strong>태평양 컨퍼런스</strong>
                                                                                </span>
                                                                            </div>
                                                                        </td>
                                                                    </tr>
                                                                    <tr style="background-color:#fff;" data-dark-style="background-color:#1f2023;" class="wiki-dynamic-a5b5640faca9f1712f81cb0b01f8ea51">
                                                                        <td style=" text-align:center;">
                                                                            <div class="wiki-paragraph">
                                                                                <strong>
                                                                                    <span class="wiki-color" style="color:#2a8c97">남부 디비전</span>
                                                                                </strong>
                                                                            </div>
                                                                        </td>
                                                                        <td style="width:25%;text-align:center;">
                                                                            <div class="wiki-paragraph">
                                                                                <strong>
                                                                                    <span class="wiki-color" style="color:#2a8c97">북부 디비전</span>
                                                                                </strong>
                                                                            </div>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <div class="wiki-paragraph">
                                                                                <strong>
                                                                                    <span class="wiki-color" style="color:#9c3628">동부 디비전</span>
                                                                                </strong>
                                                                            </div>
                                                                        </td>
                                                                        <td style="width:25%;text-align:center;">
                                                                            <div class="wiki-paragraph">
                                                                                <strong>
                                                                                    <span class="wiki-color" style="color:#9c3628">서부 디비전</span>
                                                                                </strong>
                                                                            </div>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="애틀랜타 레인">
                                                                                <span class="wiki-image-align-normal" style="height:65px;">
                                                                                    <img class="wiki-image" weight = "50px" height="180px" src="//w.namu.la/s/086414070b64b247c32471587d18772829ae8dd6f37a91c7ee534992771536aefc8a7bf79e75ace028ef17e02c6742f4a6545c363a9638619d765fe537dc659ba090906d910fc02409b1e6df51087d812c7ca076fc78e3806d15ba770805cbd2" data-filesize="10712" data-src="//w.namu.la/s/086414070b64b247c32471587d18772829ae8dd6f37a91c7ee534992771536aefc8a7bf79e75ace028ef17e02c6742f4a6545c363a9638619d765fe537dc659ba090906d910fc02409b1e6df51087d812c7ca076fc78e3806d15ba770805cbd2" alt="파일:애틀랜타 레인 로고.png" loading="lazy">
                                                                                </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="뉴욕 엑셀시어">
                                                                                    <span class="wiki-image-align-normal" style="height:65px;">
                                                                                        <img class="wiki-image" weight = "50px" height="200px" src="//ww.namu.la/s/ef873cadc8e57362fd4df5ed71a6976fef9934577eb866265784eeccaee13090f324f8a5f64b19250ccafa30a6ace0e956a380d00d5dd8e654b375f2510a22d29e9cc9b58ba31d59249304023f4a464344da9dcc8adaac40a9207586c2d1230e" data-filesize="2353" data-src="//ww.namu.la/s/ef873cadc8e57362fd4df5ed71a6976fef9934577eb866265784eeccaee13090f324f8a5f64b19250ccafa30a6ace0e956a380d00d5dd8e654b375f2510a22d29e9cc9b58ba31d59249304023f4a464344da9dcc8adaac40a9207586c2d1230e" alt="파일:뉴욕 엑셀시어 로고.png" loading="lazy">
                                                                                     </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="광저우 차지">
                                                                                    <span class="wiki-image-align-normal" style="height:65px;">
                                                                                        <img class="wiki-image" weight = "50px" height="200px" src="//w.namu.la/s/0d8adb6789a2c59e70215a03f5d2fd76c1268d2930cd92453cb9043df4ce875c68f5f95b9d4db214c0fcd41d026dc64bc89318becf37340be2d8b1025d1dd2fc2eb1d1219fa74eda6bb1429273d6672a7f6d78a1ff25266f320a74062b37b5dc" data-filesize="31603" data-src="//w.namu.la/s/0d8adb6789a2c59e70215a03f5d2fd76c1268d2930cd92453cb9043df4ce875c68f5f95b9d4db214c0fcd41d026dc64bc89318becf37340be2d8b1025d1dd2fc2eb1d1219fa74eda6bb1429273d6672a7f6d78a1ff25266f320a74062b37b5dc" alt="파일:광저우 차지 로고.png" loading="lazy">
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="LA 글래디에이터즈">
                                                                                    <span class="wiki-image-align-normal" style="height:65px;">
                                                                                        <img class="wiki-image"  weight = "50px" height="200px" src="//w.namu.la/s/1bc62bbed7432f7a59540e6b50d913256e5fe4cc974cf1bfc69b1d10a9e5a80073ff222a3419905a0e04f25c1e055984333c688691ce6397b7d45008b9e7c63fd1265a79e0e5ff55f54736c55849ef476948749b5c0a21e706bcfdf36f075576" data-filesize="6021" data-src="//w.namu.la/s/1bc62bbed7432f7a59540e6b50d913256e5fe4cc974cf1bfc69b1d10a9e5a80073ff222a3419905a0e04f25c1e055984333c688691ce6397b7d45008b9e7c63fd1265a79e0e5ff55f54736c55849ef476948749b5c0a21e706bcfdf36f075576" alt="파일:LA 글래디에이터즈 로고.png" loading="lazy">
                                                                                    </span>
                                                                            </a>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td style="background-color:#c4c4c4; text-align:center;">
                                                                            <a class="wiki-link-internal" title="애틀랜타 레인">
                                                                                    <span class="wiki-color" style="color:#910f1b">
                                                                                        <strong>애틀랜타 레인</strong>
                                                                                    </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="background-color:#171c38; text-align:center;">
                                                                            <a class="wiki-link-internal" title="뉴욕 엑셀시어">
                                                                                    <span class="wiki-color" style="color:#ff1c26">
                                                                                        <strong>뉴욕 엑셀시어</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="background-color:#122c42; text-align:center;">
                                                                            <a class="wiki-link-internal"  title="광저우 차지">
                                                                                    <span class="wiki-color" style="color:#67a2b2">
                                                                                        <strong>광저우 차지</strong></span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="background-color:#381360; text-align:center;">
                                                                            <a class="wiki-link-internal" title="LA 글래디에이터즈">
                                                                                    <span class="wiki-color" style="color:#fff">
                                                                                        <strong>LA 글래디에이터즈</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="워싱턴 저스티스">
                                                                                <span class="wiki-image-align-normal" style="height:65px;">
                                                                                    <img class="wiki-image" weight = "50px" height="190px" src="//ww.namu.la/s/a8bb1e9c7cb1dc18cb03172143a419c02e5c4c81f79d6964d645074aca572828aeacf95f8109b99ff619e762b3e338409af5614501ee3a51d766df47b6504532082ad7232e3083b171f5666d483a7d509b32313d532119e34dcadb4a70235dc4" data-filesize="44575" data-src="//ww.namu.la/s/a8bb1e9c7cb1dc18cb03172143a419c02e5c4c81f79d6964d645074aca572828aeacf95f8109b99ff619e762b3e338409af5614501ee3a51d766df47b6504532082ad7232e3083b171f5666d483a7d509b32313d532119e34dcadb4a70235dc4" alt="파일:워싱턴 저스티스 로고.png" loading="lazy">
                                                                                 </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="런던 스핏파이어">
                                                                                <span class="wiki-image-align-normal" style="height:65px;">
                                                                                    <img class="wiki-image" weight = "50px" height="180px" src="//ww.namu.la/s/1488b246050b38b43da7ce4834f7c6e0eb927dc8e24ca0bdf2156660604a676c30b2b2edc2ef7c8535b6a443c78593853cf238a6a6ffebc1a307c62f670d953c6b80d550153dfc093e320fc99b9adf549999e9cd8dd498e284d9a12fed1770c5" data-filesize="43313" data-src="//ww.namu.la/s/1488b246050b38b43da7ce4834f7c6e0eb927dc8e24ca0bdf2156660604a676c30b2b2edc2ef7c8535b6a443c78593853cf238a6a6ffebc1a307c62f670d953c6b80d550153dfc093e320fc99b9adf549999e9cd8dd498e284d9a12fed1770c5" alt="파일:런던 스핏파이어 로고.png" loading="lazy">
                                                                                </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="상하이 드래곤즈">
                                                                                <span class="wiki-image-align-normal" style="height:65px;">
                                                                                    <img class="wiki-image" weight = "50px" height="190px" src="//w.namu.la/s/6691c14dc50bd1ad25d6e776dfa663b7e1b99f9d5e68dba4cb93cedbe95fbb0ac9cde57ba659a7162184c7f3c51d09a4d81cbd2318c13d19e45e71bfe40d9675e7be9351497d8fea763357c6629cefc4844aaf681cb13cef55d19e3f0d8613cb" data-filesize="4005" data-src="//w.namu.la/s/6691c14dc50bd1ad25d6e776dfa663b7e1b99f9d5e68dba4cb93cedbe95fbb0ac9cde57ba659a7162184c7f3c51d09a4d81cbd2318c13d19e45e71bfe40d9675e7be9351497d8fea763357c6629cefc4844aaf681cb13cef55d19e3f0d8613cb" alt="파일:상하이 드래곤즈 로고.png" loading="lazy">
                                                                                </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="LA 발리언트">
                                                                                <span class="wiki-image-align-normal" style="height:65px;">
                                                                                    <img class="wiki-image" weight = "50px" height="200px" src="//w.namu.la/s/7583470ed64127105eb9ab40c855994d9bea919252c60af79bed5405dd00e1fa669510fb7c4c53401cf694af72bb2e82e53be23b947299d52427bc2fdf33cd5f8968e887f06e4f6fbb3dd1599775f54fc687c36156e32e7f92fb222cf07ffa2e" data-filesize="8092" data-src="//w.namu.la/s/7583470ed64127105eb9ab40c855994d9bea919252c60af79bed5405dd00e1fa669510fb7c4c53401cf694af72bb2e82e53be23b947299d52427bc2fdf33cd5f8968e887f06e4f6fbb3dd1599775f54fc687c36156e32e7f92fb222cf07ffa2e" alt="파일:LA 발리언트 로고 2020.png" loading="lazy">
                                                                                </span>
                                                                            </a>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td style="background-color:#990034; text-align:center;">
                                                                            <a class="wiki-link-internal" title="워싱턴 저스티스">
                                                                                    <span class="wiki-color" style="color:#fff">
                                                                                        <strong>워싱턴 저스티스</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="color:#373a3c; background-color:#59cbe8; text-align:center;">
                                                                            <a class="wiki-link-internal"  title="런던 스핏파이어">
                                                                                    <span class="wiki-color" style="color:#1c2b39">
                                                                                        <strong>런던 스핏파이어</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="background-color:#d22730; text-align:center;">
                                                                            <a class="wiki-link-internal"  title="상하이 드래곤즈">
                                                                                    <span class="wiki-color" style="color:#fce300">
                                                                                        <strong>상하이 드래곤즈</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="background-color:#1888c6; text-align:center;">
                                                                            <a class="wiki-link-internal"  title="LA 발리언트">
                                                                                    <span class="wiki-color" style="color:#ffd100">
                                                                                        <strong>LA 발리언트</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="플로리다 메이헴">
                                                                                <span class="wiki-image-align-normal" style="height:65px;">
                                                                                    <img class="wiki-image" weight = "50px" height="190px" src="//w.namu.la/s/4cdadeac98c42529ac10fc11d62a1e6c2c0fae9f60426d5ef0f32b9cb30f471626adca36de0fb84527249ef36cf25d7b5f03dff847024c3593e4043a9634b6ef5720a26421695e94eb0df9174bc59a3c2c32a7af57668ed785d1b89bd32eb8b0" data-filesize="21832" data-src="//w.namu.la/s/4cdadeac98c42529ac10fc11d62a1e6c2c0fae9f60426d5ef0f32b9cb30f471626adca36de0fb84527249ef36cf25d7b5f03dff847024c3593e4043a9634b6ef5720a26421695e94eb0df9174bc59a3c2c32a7af57668ed785d1b89bd32eb8b0" alt="파일:플로리다 메이헴 로고 3.png" loading="lazy">
                                                                                </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="보스턴 업라이징">
                                                                                    <span class="wiki-image-align-normal" style="height:65px;">
                                                                                        <img class="wiki-image" weight = "50px" height="200px" src="//w.namu.la/s/7dc4a557785222011f76ad647ac547b03861c39fb29dba0967b46d10a06f2eb9b4a6320bf8a5743dcff5af116ae02c3cac8de14a859c7588aae6455a1b0a3b76b94c753ae9c4ed6c675bbf62ad5728c99c62dfbc93f6aa9b0976c144c1ddab3c" data-filesize="13452" data-src="//w.namu.la/s/7dc4a557785222011f76ad647ac547b03861c39fb29dba0967b46d10a06f2eb9b4a6320bf8a5743dcff5af116ae02c3cac8de14a859c7588aae6455a1b0a3b76b94c753ae9c4ed6c675bbf62ad5728c99c62dfbc93f6aa9b0976c144c1ddab3c" alt="파일:보스턴 업라이징 로고.png" loading="lazy">
                                                                                    </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="서울 다이너스티">
                                                                                    <span class="wiki-image-align-normal" style="height:65px;">
                                                                                        <img class="wiki-image" weight = "50px" height="170px" src="//ww.namu.la/s/dadaea62407511aa5b1092e787797f41c395de1652c389f851bdc25391153d8c8986438e5d0bf662940e8e91126753a43525fe0133c4f41978455aa7c71579f2dfb451a24360445780a93ba33fa63f5d8858d342ebcfeae680e6618d567d8b68" data-filesize="8508" data-src="//ww.namu.la/s/dadaea62407511aa5b1092e787797f41c395de1652c389f851bdc25391153d8c8986438e5d0bf662940e8e91126753a43525fe0133c4f41978455aa7c71579f2dfb451a24360445780a93ba33fa63f5d8858d342ebcfeae680e6618d567d8b68" alt="파일:서울 다이너스티 로고.png" loading="lazy">
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="댈러스 퓨얼">
                                                                                    <span class="wiki-image-align-normal" style="height:65px;">
                                                                                        <img class="wiki-image"  weight = "50px" height="200px" src="//ww.namu.la/s/bfd4aeaf58e46ac2f9d199c2149f5bec0772b5827324f30489e834cfc059228fe496af988f651fb2151ba6a19102c4100fc8a156d3bba0f32af2eb7e1d628b9188c81ae87f18619a875cff8f4736bf6ccf63083c1aace10024f7a8a5b8d20440" data-filesize="9553" data-src="//ww.namu.la/s/bfd4aeaf58e46ac2f9d199c2149f5bec0772b5827324f30489e834cfc059228fe496af988f651fb2151ba6a19102c4100fc8a156d3bba0f32af2eb7e1d628b9188c81ae87f18619a875cff8f4736bf6ccf63083c1aace10024f7a8a5b8d20440" alt="파일:댈러스 퓨얼 로고.png" loading="lazy">
                                                                                    </span>
                                                                            </a>
                                                                        </td>
                                                                    </tr>
                                                                    <tr style="background-color:#000;">
                                                                        <td style="text-align:center;">
                                                                            <a class="wiki-link-internal"  title="플로리다 메이헴">
                                                                                    <span class="wiki-color" style="color:#cf4691">
                                                                                        <strong>플로리다 메이헴</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="background-color:#174b97; text-align:center;">
                                                                            <a class="wiki-link-internal"  title="보스턴 업라이징">
                                                                                    <span class="wiki-color" style="color:#efe400">
                                                                                        <strong>보스턴 업라이징</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="text-align:center;">
                                                                            <a class="wiki-link-internal" title="서울 다이너스티">
                                                                                    <span class="wiki-color" style="color:#a68a0f">
                                                                                        <strong>서울 다이너스티</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="background-color:#032340; text-align:center;">
                                                                            <a class="wiki-link-internal" title="댈러스 퓨얼">
                                                                                    <span class="wiki-color" style="color:#0072ce">
                                                                                        <strong>댈러스 퓨얼</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="필라델피아 퓨전">
                                                                                <span class="wiki-image-align-normal" style="height:65px;">
                                                                                    <img class="wiki-image"  weight = "50px" height="200px" src="//w.namu.la/s/a61ac15cb44ceb67a617217c5eb138b6715df4fb9fd0605c303fc52e52a98af789653661efdc8bf5614c0ddd889dabc5d6f4d36667e4fe6ec6108f434c10ad4f4a87f5caa3eeb789195131bddc5397653ac9dfae5bdf1268b2fd1645ca749132" data-filesize="4207" data-src="//w.namu.la/s/a61ac15cb44ceb67a617217c5eb138b6715df4fb9fd0605c303fc52e52a98af789653661efdc8bf5614c0ddd889dabc5d6f4d36667e4fe6ec6108f434c10ad4f4a87f5caa3eeb789195131bddc5397653ac9dfae5bdf1268b2fd1645ca749132" alt="파일:필라델피아 퓨전 로고.png" loading="lazy">
                                                                                </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="토론토 디파이언트">
                                                                                    <span class="wiki-image-align-normal" style="height:65px;">
                                                                                        <img class="wiki-image" weight = "50px" height="190px"  src="//ww.namu.la/s/d7e735091e30b85e8a825bc6bcc4dd6839d219bfad5c4a0437aa0b19df70cf8036785147c6cfb5d12cdfc99d1ab0e5f6b8f5048eae327fb2f35e7ca31d06cb9342503175ab7c252eb6866722cb354fabd4c161249faa86c539cd6d735b5b63fb" data-filesize="3101" data-src="//ww.namu.la/s/d7e735091e30b85e8a825bc6bcc4dd6839d219bfad5c4a0437aa0b19df70cf8036785147c6cfb5d12cdfc99d1ab0e5f6b8f5048eae327fb2f35e7ca31d06cb9342503175ab7c252eb6866722cb354fabd4c161249faa86c539cd6d735b5b63fb" alt="파일:토론토 디파이언트 로고.png" loading="lazy">
                                                                                    </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="청두 헌터즈">
                                                                                    <span class="wiki-image-align-normal" style="height:65px;">
                                                                                        <img class="wiki-image" weight = "50px" height="170px" src="//w.namu.la/s/63ebd337be8aae96b3e680e2bbfc5bb8f68939e7492b54589341482996c1e6354b00801e9ed551312bc8b3921c703ff31522e5fef453794deca713387d6b296d6a7c7ca462a384824841f7da5adfd7717364f27e3188b28cf66e242a2b3eff59" data-filesize="59205" data-src="//w.namu.la/s/63ebd337be8aae96b3e680e2bbfc5bb8f68939e7492b54589341482996c1e6354b00801e9ed551312bc8b3921c703ff31522e5fef453794deca713387d6b296d6a7c7ca462a384824841f7da5adfd7717364f27e3188b28cf66e242a2b3eff59" alt="파일:청두 헌터즈 로고.png" loading="lazy">
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="밴쿠버 타이탄즈">
                                                                                    <span class="wiki-image-align-normal" style="height:65px;">
                                                                                        <img class="wiki-image" weight = "50px" height="190px" src="//ww.namu.la/s/61d21ca02d4477d1983eff0c9e7a96ca275ee8dde18985108df801462963b84f8ee922a3a8e1b7e275539d557afce1e629216e2d64bcff344b41fce65377b8b6a337c7501ba27cde72508ab030e65d89c7047b3a7f9c69be2c804d2dd0f46737fb175b7b38de969344142d13e9bc664e" data-filesize="40555" data-src="//ww.namu.la/s/61d21ca02d4477d1983eff0c9e7a96ca275ee8dde18985108df801462963b84f8ee922a3a8e1b7e275539d557afce1e629216e2d64bcff344b41fce65377b8b6a337c7501ba27cde72508ab030e65d89c7047b3a7f9c69be2c804d2dd0f46737fb175b7b38de969344142d13e9bc664e" alt="파일:밴쿠버 타이탄즈 로고.png" loading="lazy">
                                                                                    </span>
                                                                            </a>
                                                                        </td>
                                                                    </tr>
                                                                    <tr style="background-color:#000;">
                                                                        <td style="text-align:center;">
                                                                           <a class="wiki-link-internal" title="필라델피아 퓨전">
                                                                                    <span class="wiki-color" style="color:#f89c3f">
                                                                                        <strong>필라델피아 퓨전</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="text-align:center;">
                                                                            <a class="wiki-link-internal"  title="토론토 디파이언트">
                                                                                    <span class="wiki-color" style="color:#c10022">
                                                                                        <strong>토론토 디파이언트</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="color:#373a3c; background-color:#ff9e00; text-align:center;">
                                                                            <a class="wiki-link-internal"  title="청두 헌터즈">
                                                                            <span class="wiki-color" style="color:#161824">
                                                                                <strong>청두 헌터즈</strong>
                                                                            </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="background-color:#021c6b; text-align:center;">
                                                                            <a class="wiki-link-internal"  title="밴쿠버 타이탄즈">
                                                                                    <span class="wiki-color" style="color:#2bb323">
                                                                                        <strong>밴쿠버 타이탄즈</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="휴스턴 아웃로즈">
                                                                                <span class="wiki-image-align-normal" style="height:65px;">
                                                                                    <img class="wiki-image" weight = "50px" height="180px" src="//ww.namu.la/s/3a97465a219e912bf53d4745149299c8382d0988737e6047cbd698185478cd8b6fa3f56c589e950d0f17cc77a6d8910c55992feb6e92a446fd1ba7117eecbbfdbd33a78b255b931ebf1e4d9f617015d1ac6e2013d579c0c480bebbef9704545b" data-filesize="36441" data-src="//ww.namu.la/s/3a97465a219e912bf53d4745149299c8382d0988737e6047cbd698185478cd8b6fa3f56c589e950d0f17cc77a6d8910c55992feb6e92a446fd1ba7117eecbbfdbd33a78b255b931ebf1e4d9f617015d1ac6e2013d579c0c480bebbef9704545b" alt="파일:휴스턴 아웃로즈 로고.png" loading="lazy">
                                                                                        </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="파리 이터널">
                                                                                    <span class="wiki-image-align-normal" style="height:65px;">
                                                                                        <img class="wiki-image" weight = "50px" height="170px" src="//w.namu.la/s/c86f026e5a25d77d14e1f3fe80d2e7a4bc36ac3149d0f54972972b48eb1e401deaca6da4f74688a47c8fcbd6f4889bb073905b3ca35fd52d759984c482f63b86915246c37794fbb2c0ce47e06978553a001bbde85d1c4dab313efe3e1de4c6b7" data-filesize="23849" data-src="//w.namu.la/s/c86f026e5a25d77d14e1f3fe80d2e7a4bc36ac3149d0f54972972b48eb1e401deaca6da4f74688a47c8fcbd6f4889bb073905b3ca35fd52d759984c482f63b86915246c37794fbb2c0ce47e06978553a001bbde85d1c4dab313efe3e1de4c6b7" alt="파일:파리 이터널 로고.png" loading="lazy">
                                                                                        </span>
                                                                            </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="항저우 스파크">
                                                                                    <span class="wiki-image-align-normal" style="height:65px;">
                                                                                        <img class="wiki-image" weight = "50px" height="200px" src="//w.namu.la/s/f9474022f20c46584a3ecd96b5a5c7bd29b38675689222f0bc13010df3ddaac389865095bbfe16c30368742a532c8cefca2e34a117901f4446553e672e9d4788e6b8c5cbd44fbc73b893bc0749a3fb05d25fc5b414b8e48ed63c8bf1c9520a64" data-filesize="42584" data-src="//w.namu.la/s/f9474022f20c46584a3ecd96b5a5c7bd29b38675689222f0bc13010df3ddaac389865095bbfe16c30368742a532c8cefca2e34a117901f4446553e672e9d4788e6b8c5cbd44fbc73b893bc0749a3fb05d25fc5b414b8e48ed63c8bf1c9520a64" alt="파일:항저우 스파크 로고.png" loading="lazy">
                                                                                        </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="width:25%; text-align:center;">
                                                                            <a class="wiki-link-internal" href="/detail" title="샌프란시스코 쇼크">
                                                                                    <span class="wiki-image-align-normal" style="height:65px;">
                                                                                        <img class="wiki-image" weight = "50px" height="200px" src="//w.namu.la/s/3fabb6a4b05c98aa8e749ff3baa32d410947b495ecf07001bcc088c6104ad527201b2e8c3dffdcaa0eef9d977720b51c9538f83801f1c5e21817653294dfc07dc7954182f706d8a87b1d48d58ac148642043bffb36171a36d750818ac8719668" data-filesize="4876" data-src="//w.namu.la/s/3fabb6a4b05c98aa8e749ff3baa32d410947b495ecf07001bcc088c6104ad527201b2e8c3dffdcaa0eef9d977720b51c9538f83801f1c5e21817653294dfc07dc7954182f706d8a87b1d48d58ac148642043bffb36171a36d750818ac8719668" alt="파일:샌프란시스코 쇼크 로고 3.png" loading="lazy">
                                                                                        </span>
                                                                            </a>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td style="color:#373a3c; background-color:#97d700; text-align:center;">
                                                                             <a class="wiki-link-internal"  title="휴스턴 아웃로즈">
                                                                                    <span class="wiki-color" style="color:#000">
                                                                                        <strong>휴스턴 아웃로즈</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="background-color:#303d56; text-align:center;">
                                                                             <a class="wiki-link-internal"  title="파리 이터널">
                                                                                    <span class="wiki-color" style="color:#ffaa1c">
                                                                                        <strong>파리 이터널</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="background-color:#fa7298; text-align:center;">
                                                                            <a class="wiki-link-internal"  title="항저우 스파크">
                                                                                    <span class="wiki-color" style="color:#fff">
                                                                                        <strong>항저우 스파크</strong></span>
                                                                                </a>
                                                                        </td>
                                                                        <td style="background-color:#000; text-align:center;">
                                                                            <a class="wiki-link-internal" title="샌프란시스코 쇼크">
                                                                                    <span class="wiki-color" style="color:#a5acaf">
                                                                                        <strong>샌프란시스코 쇼크</strong>
                                                                                    </span>
                                                                                </a>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td colspan="4" style="text-align:right;">
                                                                            <div class="wiki-paragraph"></div>
                                                                        </td>
                                                                    </tr>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </span>
                                                </div>
                                            </dd>
                                        </dl>
                                    </span>
                                </div>
                            </div>
                        </td>
                    </tr>
                </tbody>
            </template>
        </v-simple-table>
    </div>
</template>

<script>
    import {mapState} from 'vuex'
    export default {
        data () {
            return {
            }
        },
        created() {
        },
        computed : {
            ...mapState({
                owteams : (state) => state.crawling.owteams,
                count : (state) => state.crawling.count,
                searchWord : (state) => state.crawling.searchWord
            })
        }
    }
</script>

<style scoped>
    .google{
        width: 140px;
        height: 45px;
        margin-right: 20px;
    }
    .search{
        width: 550px;
        height: 40px;
        font-size: 15pt;
        box-shadow: 3px 3px 5px #C3C3C3;
        border: 1px solid #EAEAEA;
    }
    .top{
        text-align: center;
        margin: 10px;
    }
    .image{
        width: 250px;
        height : 250px;
    }
    .divition_logo{
        width: 30px;
        height : 30px;
    }
</style>
