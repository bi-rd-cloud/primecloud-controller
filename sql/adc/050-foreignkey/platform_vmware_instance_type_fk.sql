alter table PLATFORM_VMWARE_INSTANCE_TYPE add constraint PLATFORM_VMWARE_INSTANCE_TYPE_FK1 foreign key (PLATFORM_NO) references PLATFORM (PLATFORM_NO);
alter table PLATFORM_VMWARE_INSTANCE_TYPE add constraint PLATFORM_VMWARE_INSTANCE_TYPE_FK2 foreign key (PLATFORM_NO) references PLATFORM_VMWARE (PLATFORM_NO);