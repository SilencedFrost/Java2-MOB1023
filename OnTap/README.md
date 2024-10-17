Bài ôn tập, sử dụng generics và tạo ra class SwingHelper gồm nhiều tiện ích để hỗ trợ làm swing và thích ứng với bất kỳ model nào nhờ abstract class DAO và interface Exportable
Đồng thời sử dụng Enum SHelper để switch case trạng thái một cách rõ ràng hơn

Đề ở [đây](https://github.com/SilencedFrost/Java2-MOB1023/blob/main/OnTap/src/Resources/%C4%90%E1%BB%81%20%C3%B4n%20t%E1%BA%ADp%20thi%20.pdf)

Hướng dẫn sử dụng SwingHelper.java:

Yêu cầu: cần 6 file như hình

![{8D4F27EC-2B41-4D00-9B28-D72C1FBE3701}](https://github.com/user-attachments/assets/f4899972-cfc2-49d8-a965-30aee6000c39)

Để tạo object và truy xuất dữ liệu, người dùng sẽ tạo model và DAO như sau
(Nhớ import Exportable và DAO từ các file có sẵn)

Tạo model theo cấu trúc:

![{CC5F0A89-619E-4E50-BE51-7982E9C59C46}](https://github.com/user-attachments/assets/1163a57c-f44a-4bee-9b72-a69f8f384b18)

Ví dụ:

![{F3CBC145-296A-4354-97B1-B36942A52850}](https://github.com/user-attachments/assets/cf18d25f-d75b-4dd1-a996-6909adc1123f)

Tạo DAO theo cấu trúc:

![{F12FD6A8-0919-454D-BFC3-6A2A30500A1B}](https://github.com/user-attachments/assets/949c8442-fd1d-408c-a052-df748d593a16)

Ví dụ:

![{9B6CADF3-26AD-4984-A1E7-9535C15D9EB5}](https://github.com/user-attachments/assets/8ad65973-c1a7-4195-883c-45b21f82986e)

Vậy là xong phần quản lý dữ liệu
Tiếp đến là sử dụng SwingHelper

Ở đầu file JFrame của bạn, khởi chạy SwingHelper như sau:

![{766F65D2-3E16-418D-A1DF-F0F636EEB911}](https://github.com/user-attachments/assets/de9e1ab0-bfa1-483d-98d8-8c863720cd03)

Ví dụ:

![{0D6E4A32-0416-4489-9EF5-53C8466A7346}](https://github.com/user-attachments/assets/6e706f4b-ea89-44c0-904d-55b4b89f0d5f)
