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

![{8BA9EF0B-EF65-4CE2-ACC7-5E113C014F0E}](https://github.com/user-attachments/assets/bd2d9fd0-9a7b-454c-9aa6-23211cd7c71f)

Ví dụ:

![{596E0A1B-D920-46C6-82C4-FC7D06230C22}](https://github.com/user-attachments/assets/30b43c5a-92c3-4891-9733-2ad6deecafb3)

Vậy là xong phần quản lý dữ liệu
Tiếp đến là sử dụng SwingHelper

Ở đầu file JFrame của bạn, khởi chạy SwingHelper như sau:

![{0B736379-E635-4F33-A684-9683755BD14B}](https://github.com/user-attachments/assets/6d94321a-084a-471e-b5d9-2e05c3f638c2)

Ví dụ:

![{0D6E4A32-0416-4489-9EF5-53C8466A7346}](https://github.com/user-attachments/assets/6e706f4b-ea89-44c0-904d-55b4b89f0d5f)

Vậy là bây giờ bạn có thể gọi swingHelper hoặc dao từ bất cứ đâu trong file
- swingHelper là các tiện ích Swing
- dao hỗ trợ quản lý dữ liệu

Các hàm căn bản của DAO:

![{C49FEF60-3FAE-439D-B75E-7AA22ED48050}](https://github.com/user-attachments/assets/de43f324-594a-4869-a23b-cc71e07332c9)

![{6DB05469-5505-4C74-8BAA-BC402415C2E7}](https://github.com/user-attachments/assets/de1a5503-4e17-46f8-aa7c-ac2956863d53)

![{DE2D6899-8E74-400B-9711-3739D5B05519}](https://github.com/user-attachments/assets/c5232fc8-97d4-4ecc-8d90-03c268db2d41)

![{0629812A-DBC7-4B20-BEE3-4B761EC42724}](https://github.com/user-attachments/assets/cd466c3b-083c-4c35-bdec-1bf1e375c184)

![{00F26949-A97B-433E-B3B0-36D0A8A1DAE7}](https://github.com/user-attachments/assets/fd815a23-9f0b-4347-afeb-0e63c0b8d42e)

![{FBDB7C41-A6F2-4DD7-8213-85180DE853F2}](https://github.com/user-attachments/assets/f85c1373-2f7a-462a-b79b-a31b64b3dc21)

![{8AE3033B-A278-409B-97D0-4D8AFD4F4398}](https://github.com/user-attachments/assets/cb80e1b0-b740-4c10-aaeb-5aa4781e74f4)

Các hàm của swingHelper:
