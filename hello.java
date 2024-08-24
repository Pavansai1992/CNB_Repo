---
- hosts: all
  become: true
  tasks: 
   - name: Install httpd package
     yum:
       name: httpd
       state: present
   - name: copy index.html file
     copy: 
       src: index.html
       dest: /var/www/html/index.html
   - name: 
     service:
      name: httpd
      state: started
...